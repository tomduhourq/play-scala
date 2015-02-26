# Play! 2 for Scala tutorial

This is a project intended to be a tutorial to start using Play! 2 Framework with Scala, and for my own because I had quite a mess managing to run everyhting on my IDE.

I am using Scala 2.11.5 and Intellij IDEA 14 Community Edition (this is important to my belief because the scala plugin doesn't have support for Play! in com edition).

## Install 

  Download the activator (previous play command) from:

  [Play! 2 official site](https://www.playframework.com/download)
    
  Unzip the activator to the location you like and open your .bashrc or .zshrc and add:
 
  ````bash
  export PATH=$PATH:/path/to/activator
  ````
  
  Run  ````activator ```` This will download all the dependencies
  
  Wherever you want to start building your application type ````activator new [app-name] [template-name]```` with template-name being ````play-scala```` in our case.
  
  Inside the ````[app-name]```` folder just created type ````activator```` to enter console mode (will take a few minutes)
  
## Damn Import 
  
  As I mentioned before, we have troubles to import the app to Intellij and getting the dependencies correctly detected, so MY personal solution was to:
  
  ````sbt clean```` inside the project's folder + 
  remove all ````.idea```` and all ````.iml```` files + 
  ````sbt idea```` inside the project's folder



