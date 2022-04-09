package org.junit.internal.runners.model;

import java.util.List;

@Deprecated
public class MultipleFailureException extends org.junit.runners.model.MultipleFailureException {

    public MultipleFailureException(List<Throwable> errors) {
        super(errors);
    }
}
