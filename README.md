# Steam exercises (Java, Selenium and Testng)

These are basic testing and automation exercises on the Steam video game page. The goal is to pass all use cases.


## First case - Invalid Login

| Actors               | Purpose                                   | Description                                                                                  | Expected result                  |
|:---------------------|:------------------------------------------|:---------------------------------------------------------------------------------------------|:---------------------------------|
| `User, Login System` | `Deny access to a randomly created user.` | The user must enter the page, go to the section where they can register and try to register. | Steam denies access to the user. |

#### Alternative

```http
- Alternative flow: In the case of providing a valid username and password in "testData.json", commenting the "normal" code block and uncommenting the "alternative" code block, you will have access to the following form.

- Alternative result: Steam gives access and displays the validation form.
```