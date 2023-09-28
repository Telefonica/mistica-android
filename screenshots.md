## Screenshot testing
Screenshot tests compares current screenshots of the app with a set of desired ones. To achieve that we need to perform 2 tasks:

	1. Generate and store a set of desired screenshots (also known as baseline). 
	These screenshots will be generated using a reference device to avoid differences based on Android devices/versions
	2. Take screenshots of the app with this reference device and compare them with the baseline. 
	Then generate reports with differences detected

To perform these tasks we use [Roborazzi](https://github.com/takahirom/roborazzi) library which uses gradle tasks to generate baseline and store screenshots

## Add a new screenshot
To create a new screenshot create a new unitTest with Roboelectric in the test folder of the module to test:
    @RunWith(RobolectricTestRunner::class)
or
    @RunWith(ParameterizedRobolectricTestRunner::class)
depending if it's a parametrized test or not. Use
    @RunWith(Enclosed::class)
in case multiple of them must be on the same file.

Then use `captureRoboImage()` function to take the screenshot and use `ScreenshotUtils.getScreenshotName()` to set the name of the test.:

    composeTestRule.onRoot()
            .captureRoboImage(ScreenshotUtils.getScreenshotName())

For traditional views run an activity or check `TextInputTest.kt` example on how to use a dummy activity to load them inside.

## Check that changes in the screen are detected
`Compare Screenshots` job will run in each pr and will run the `verifyRoborazziDebug` gradle task that checks the screenshots. In case this fails it will 
generate a report and upload it to azure.

## Access to screenshots test report
At the bottom of the summary of the action that has failed you'll see that a report has been uploaded to azure. 

Once that compressed file is downloaded an html report is there with the differences detected between the current screenshot (left side) and the 
newly generated one (right side).

## Update screenshots baseline
Either run the ci job `Update screenshot baseline` that will create the images and perform a commit for you or run the gradle task `recordRoborazziDebug` and
this way it allows you to check everything is ok before uploading the images.



