package com.github.joeberger.obd.reader.io;

public interface ObdProgressListener {

    void stateUpdate(final ObdCommandJob job);

}