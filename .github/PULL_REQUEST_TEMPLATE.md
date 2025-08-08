### :goal_net: What's the goal?
_Provide a description of the overall goal. The description in the Jira ticket may help._

### :construction: How do we do it?
_Provide a description of the implementation. A list of steps would be ideal._
* _Step 1_
* _Step 2_
* _Step 3_

### ☑️ Checks
- [ ] I updated the documentation, including readmes and wikis. If this is a breaking change, tag the PR with "Breaking Change" label and remember to include breaking change migration guide in release notes where this version is released.
- [ ] Tested with dark mode.
- [ ] Tested with API 24.
- [ ] Sync done with iOS team for this feature to ensure alignment, if applies.
- [ ] Accessibility considerations.

### :test_tube: How can I test this?
_If it cannot be tested explain why._
- [ ] 🖼️ Screenshots/Videos
- [ ] Mistica App QR or download link
- [ ] Reviewed by Mistica design team
- [ ] ...

### 🤖 Copilot review
@copilot Please review this PR for potential breaking changes in the public API **within the `library` module only**.

Focus on:
- Removed or renamed public classes, interfaces, enums, methods, properties, or constants.
- Changes in method signatures (parameters, return types).
- Visibility changes (e.g., public → protected/private/package-private).
- Enum value removals.
- Removal of public annotations or change of annotation values (e.g., @JvmOverloads, @Deprecated).
- Behavioral changes that keep the signature but alter the contract (e.g., new exceptions thrown, different return values for same input).

Review all modified files in the `library` module and comment on each breaking change.
