# 1816 Style Guide

Welcome to our style guide! Before you start writing code for the robot, please read this README and look through `ClassStyleGuide` to help keep our code clean and maintainable.

## Commits: descriptive but concise

Many times throughout the season, a CS member may be scrolling through the commit history, wondering when (or if) a certain change was made. If you have anything else to add, GitHub allows you to write comments under your commits.

## Proper grammar and present tense on all commits

Simply an industry standard across many Git repositories across the internet. Stay professional.

**DO**:

```txt
Adjust robot arm position to be slightly higher
```

**DON'T**:

```txt
fixed stuff
```

## Don't merge into main directly

Don't put your code onto the main branch. Open a Pull Request instead! This is to keep everyone on the same page on how the code is doing.

## Document (ALMOST) everything

Some people say "it should be obvious what every line of code does," and that's fine for large-scale companies with a bunch of time on their hands. FRC robotics, on the other hand, is about rapid prototyping, so we can't do that. However, writing _understandable_ code is a big necessity. So, if you're conjuring some weird magic to get something working, leave a comment on what it does.

For entire variables, methods and classes, read up on [JavaDocs](https://www.baeldung.com/javadoc) (ignore everything after "JavaDoc Generation") if they aren't familiar to you. Our IDEs allow us to hover over elements in our code to see what they do, which helps with auditing code.

For examples of what _not_ to do, check out the 2024-2025 Zone repository!

![Zone CoralArm class](https://github.com/TheGreenMachine/Style-Guide/blob/main/assets/pain_to_work_with.png?raw=true "War Crimes")

## Ethan, Spaghettifier of Code

Ethan is a perpetrator of the horrible crime that is bad commit messages. He is hereby prohibited from writing any more code.

![Ethan's Commit Messages](https://github.com/TheGreenMachine/Style-Guide/blob/main/assets/ethans_commits.png?raw=true "War Crimes")
