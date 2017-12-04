package com.mediabrands.optimization;

import com.mediabrands.optimization.dto.MessageError;

import java.util.List;

public interface OptimizationInputValidator {

    public List<MessageError> validate(List<?> listToValidate);
}
