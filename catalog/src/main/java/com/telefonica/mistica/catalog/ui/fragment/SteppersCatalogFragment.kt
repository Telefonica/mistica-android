package com.telefonica.mistica.catalog.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.input.DropDownInput
import com.telefonica.mistica.stepper.DeterminateStepperView

class SteppersCatalogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return layoutInflater.inflate(R.layout.screen_steppers_catalog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val numberOfStepsDropDown = view.findViewById<DropDownInput>(R.id.number_of_steps_dropdown)
        val determinedStepper = view.findViewById<DeterminateStepperView>(R.id.determined_stepper)
        val previousStep = view.findViewById<Button>(R.id.previous_step)
        val nextStep = view.findViewById<Button>(R.id.next_step)

        val numberOfSteps = arrayOf(2, 3, 4, 5, 6)

        var currentStep = 1
        var maxSteps = 2

        with(numberOfStepsDropDown.dropDown) {
            setAdapter(
                ArrayAdapter(
                    view.context,
                    R.layout.dropdown_menu_popup_item,
                    numberOfSteps
                )
            )
            setText(2.toString(), false)
            setOnItemClickListener { _, _, position, _ ->
                maxSteps = numberOfSteps[position]
                currentStep = 1

                determinedStepper.setMaxSteps(maxSteps)
            }
        }

        previousStep.setOnClickListener {
            if (currentStep - 1 > 0) {
                determinedStepper.setStep(--currentStep)
            }
        }

        nextStep.setOnClickListener {
            if (currentStep + 1 <= maxSteps + 1) {
                determinedStepper.setStep(++currentStep)
            }
        }
    }
}
