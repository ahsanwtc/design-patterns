# Exercise

We’re building an email client like Outlook. Our client should be able to connect to different mail servers such 
as Gmail, Yahoo, etc.

In the `exercise` package, you can see an interface called `EmailProvider`. Our `EmailClient` class talks to this 
interface so that it’s not coupled to a particular mail service.

Here’s the problem: In the Gmail package, you can find the class (or classes) that Google provides to connect to Gmail. 
These classes are shipped as a third-party library that we can add to our application. We want to re-use these classes 
but the `GmailClient` class does not extend our `EmailProvider` interface.

Use the adapter problem to convert the interface of `GmailClient`.