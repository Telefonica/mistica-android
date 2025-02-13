# Contributing to mistica-android

Thank you for your interest in Mística. You can contribute to this project in several ways:

Feel free to contact maintainers at the
[Mística Teams Channel](https://teams.microsoft.com/l/channel/19%3ad2e3607a32ec411b8bf492f43cd0fe0c%40thread.tacv2/General?groupId=e265fe99-929f-45d1-8154-699649674a40&tenantId=9744600e-3e04-492e-baa1-25ec245c6f10).
Don't hesitate to ask any questions and share your ideas

## Pull Requests

We would love to accept your Pull Requests but please
- Before starting your development, [create an issue](https://github.com/Telefonica/mistica-android/issues/new/choose).
- Once the pull request is created, make sure that you add someone from **Telefonica/mistica-design** team as reviewer to it.

## Bug reports

If something is broken or not working as expected, let us know!

:bug: [Open a Bug issue](https://github.com/Telefonica/mistica-android/issues/new?assignees=&labels=bug&template=bug-report.md&title=)

## Feature requests (no UI/UX changes)

If you need additional functionality, support a new use case, improve a component API...

:construction: [Open a Feature Request issue](https://github.com/Telefonica/mistica-android/issues/new?assignees=&labels=enhancement&template=feature-request.md&title=)

**Important:** Your feature request should not include UI or UX changes, only implementation details, because
those kind of changes must be evaluated, approved and documented by the `Design Core Team` (see
[New component proposals or UI/UX changes](#new-component-proposals-or-uiux-changes) section).

## Documentation and help requests

Is something in our documentation not well explained? Do you need help using a component? 

:blue_book: [Open an Documentation issue](https://github.com/Telefonica/mistica-android/issues/new?assignees=&labels=documentation&template=documentation-request.md&title=)

## New component proposals or UI/UX changes

Adding a new component to the Mística Design System or updating the UI/UX of an existing one requires to
follow a process where the component and its use cases will be evaluated by the `Design Core Team`.

Share your ideas at the
[Mística Teams Channel](https://teams.microsoft.com/l/channel/19%3ad2e3607a32ec411b8bf492f43cd0fe0c%40thread.tacv2/General?groupId=e265fe99-929f-45d1-8154-699649674a40&tenantId=9744600e-3e04-492e-baa1-25ec245c6f10)
or [open an issue](https://github.com/Telefonica/mistica/issues) in the main Mistica Repository

## How to work with mistica-android

To create or modify components on this repository, follow the next steps:

1. Clone this repo

2. Open project with Android Studio. Code style setup is automatically configured for the IDE with files included in the repo.

3. Place the new component under `library` module, under `com.telefonica.mistica` package. The component should have a proper definition by the design team. When implementing the component, follow these guidelines:
   - The component should be implemented to be reusable. Make it **generic** enough so that other teams can also use it.
   - If it is designed to be part of a layout definition (It's not a floating element), it should be implemented as a **Custom View**.
     - It must allow **configuration with layout attributes**.
     - It must provide **databinding support** for these attributes.
     - It must also provide relevant **public methods to configure the view programatically**.
   - In case it is a floating element, provide **necessary classes/builders to configure it** before display.
   - Make sure the component **resizes correctly**, so it adapts correctly to any screen size (including rotation).
   - If possible, take into account **accessibility** (TalkBack, Font size modification).
   - Take into account provided **themes**, and check your view is correctly displayed for all them.

4. To help other developers, add (or update) associated documentation.
   - Place this documentation under a `README.md` file at package directory where component was defined.
  
5. Add your component to the catalog, by including it and its variants inside `catalog` module, so other developers can quickly test it.
   - Add a new entry to the main section list.
   - Add a new fragment to show the different component variants.


## Release a new version
To release a new version of the libraries you just need to create a GitHub release in https://github.com/Telefonica/mistica-android/releases clicking in `Draft a new release`. Create a new tag with the specific version number and click on `Generate release notes` to complete the release notes automatically. Clicking on `Publish release` the release will be created and the libraries will be updated.

The library uses the x.y.z **versioning pattern** (example: 1.1.0) where each number should be incremented considering the following rules:
X -> Breaking changes
Y -> New components or features
Z -> Minor modifications or fixes

You can find more information here https://semver.org/
