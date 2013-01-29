scala-fun
=========

Playground for scala

Installing scala
----------------

Assuming you have the JVM installed, lets build Scala for deployment in a user directory (good practice for not relying on the OS to provide you with up to date packages). I am using ArchLinux x86\_64, so keep that in mind.

    prefix=~/lang
    cd ~/tmp
    curl -O http://www.scala-lang.org/downloads/distrib/files/scala-2.10.0.tgz
    tar xzf scala-2.10.0.tgz
    # look at that, you dont need to build anything!
    mkdir -p $prefix/usr/local/scala
    cp -r scala-2.10.0/* $prefix/usr/local/scala/
    export PATH=$PATH:$prefix/usr/local/scala/bin
    export SCALA_HOME=$prefix/usr/local/scala
    export MANPATH=$MANPATH:$prefix/usr/local/scala/man

