---
applyTo: "library/**/*"
excludeAgent: "coding-agent"
---

# Copilot review
Please perform your normal Pull Request review. 
Additionally, check for potential breaking changes.

Focus specifically on detecting:
- Removal or renaming of public classes, interfaces, enums, methods, properties, or constants.
- Removal or modification of enum values.
- Changes to method signatures (parameters, types, nullability, default parameter values, return types).
- Visibility changes that reduce accessibility (e.g., public → internal/private/protected).
- Removal or modification of public annotations or their values.
- Behavioral changes that preserve the signature but alter the contract.
- Removal of deprecated APIs, ensuring they had been deprecated long enough.
- For UI components, changes to XML attributes, theming contracts, styleable entries, or required resources that may break clients.

For any potential breaking change:
- Remind the author to add the “Breaking change” label to the PR.
- Remind us to include the migration notes when the release is drafted.