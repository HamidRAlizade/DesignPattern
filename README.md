# Common Design Patterns for Android with Kotlin
#### Beyond satisfying your clients and your employer, there’s one more important individual to keep happy in your career as a developer: Future You! (The artist’s conception of Future You to the right implies no guarantee of such cool shirts for developers in the near future.) :]

#### Future You will inherit the code you write at some point down the road, and will likely have a lot of questions about how and why you coded things the way you did. But instead of leaving tons of confusing comments in your code, a much better approach is to adopt common design patterns.

#### This article will introduce a few common design patterns for Android that you can use while developing apps. Design patterns are reusable solutions to common software problems. The design patterns covered here aren’t an exhaustive list, nor an academically-citable paper. Rather, they serve as a workable references and starting points for further investigation.

## Getting Started
“Is there anywhere in this project where I’ll have to change the same thing in multiple places?” – Future You

#### Future You should minimize time spent doing “detective work” looking for intricate project dependencies, so they would prefer  a project that’s as reusable, readable, and recognizable as possible. These goals span a single object all the way up to the entire project and lead to patterns that fall into the following categories:

    Creational patterns: how you create objects.
    Structural patterns: how you compose objects.
    Behavioral patterns: how you coordinate object interactions.

#### You may already be using one or several of these patterns already without having A Capitalized Fancy Name for it, but Future You will appreciate you not leaving design decisions up to intuition alone.

#### In the sections that follow, you’ll cover the following patterns from each category and see how they apply to Android:

## Creational

    Builder
    Dependency Injection
    Singleton

## Structural

    Adapter
    Facade

## Behavioral

    Command
    Observer
    Model View Controller
    Model View ViewModel
    Clean Architecture

### Note: This article isn’t like a traditional raywenderlich.com tutorial in that it doesn’t have an accompanying sample project that you can follow along with. Treat it instead like an article to get you up to speed to the different patterns you’ll see used in our other Android tutorials, and to discover ways to improve your own code.
