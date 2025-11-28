---
applyTo: "library/**/*, library-test-utils/**/*, tokens/**/*"
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
- Create a separate comment describing why it may break existing consumers.
- Check if the PR includes migration notes and request them if missing