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

Create a separate comment for every potential breaking change you find. 