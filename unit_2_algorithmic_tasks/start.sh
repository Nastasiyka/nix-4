#!/bin/sh
javac -sourcepath ./src -d build/classes src/alevel/Main.java
java -cp build/classes/ alevel.Main