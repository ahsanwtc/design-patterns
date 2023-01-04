# Exercise

We’re using a third-party GUI framework for building an application. We need to build a dialog box for a new user to sign up. 
On this dialog box we need three UI elements:

- A text box to enter a username
- A text box to enter a password 
- A checkbox to agree with the terms 
- A signup button
 
The signup button is only enabled if both text boxes are filled out and the checkbox is checked.

Use the mediator pattern with the observer pattern to implement the coordination between these elements in a 
class called SignUpDialogBox.  