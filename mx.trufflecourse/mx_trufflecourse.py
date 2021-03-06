import tarfile
import os
from os.path import join
import shutil
import subprocess
from argparse import ArgumentParser

import mx
import mx_subst
import mx_sdk
import re

_suite = mx.suite('trufflecourse')

def getClasspathOptions(extra_dists=None):
    """gets the classpath of the Sulong distributions"""
    return mx.get_runtime_jvm_args((extra_dists or []))

def runPlainAST(args=None, out=None, get_classpath_options=getClasspathOptions):
    dists = ["TruffleCourse"]
    return mx.run_java(get_classpath_options(dists) + ["-XX:+EnableJVMCI","-XX:+UseJVMCICompiler"] + 
    args+ ["org.truffle.cs.samples.PlainAST.PlainAST"], out=out,jdk=mx.get_jdk())

def runMJInterpreter(args=None, out=None, get_classpath_options=getClasspathOptions):
    dists = ["TruffleCourse"]
    return mx.run_java(get_classpath_options(dists) + ["-XX:+EnableJVMCI","-XX:+UseJVMCICompiler","-Dgraal.TraceTruffleCompilation=true", "-Dgraal.PrintGraph=Network", "-Dgraal.Dump=Truffle:5", "-Dgraal.TruffleBackgroundCompilation=false"] + 
    args+ ["org.truffle.cs.mj.main.MJRuntime"], out=out,jdk=mx.get_jdk())


def runPESamples(args=None, out=None, get_classpath_options=getClasspathOptions):
    dists = ["TruffleCourse"]
    return mx.run_java(get_classpath_options(dists) + ["-XX:+EnableJVMCI",
    "-XX:+UseJVMCICompiler","-Dgraal.TraceTruffleCompilation=true",
    "-Dgraal.TruffleCompileImmediately=true",
    "-Dgraal.TruffleBackgroundCompilation=false"] + args+ ["org.truffle.cs.samples.SimplestPEA"], out=out,jdk=mx.get_jdk())


mx.update_commands(_suite, {
    'peSamples' : [runPESamples, ''],
    'mjInterpreter' : [runMJInterpreter, ''],
    'plainAST' : [runPlainAST,'']
})
