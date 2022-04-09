package org.junit.experimental.max;

/**
 * Thrown when Max cannot read the MaxCore serialization
 */
public class CouldNotReadCoreException extends Exception {

    /**
     * Constructs
     */
    public CouldNotReadCoreException(Throwable e) {
        super(e);
    }
}
