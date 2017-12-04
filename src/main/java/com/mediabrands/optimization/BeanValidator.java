package com.mediabrands.optimization;

import com.mediabrands.optimization.dto.MessageError;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BeanValidator implements OptimizationInputValidator {

    private static Validator validator;

    public BeanValidator() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Override
    public List<MessageError> validate(List<?> listToValidate) {
        return listToValidate.stream()
                .map(validator::validate)
                .map(this::transformConstraintViolationToMessageError)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    private List<MessageError> transformConstraintViolationToMessageError(Set<? extends ConstraintViolation<?>> setConstraints) {
        return setConstraints.stream()
                .map(i -> new MessageError(i.getMessage().split(":")[1], "optimization.error.isNotEmpty", i.getMessage().split(":")[0]))
                .collect(Collectors.toList());

    }
}
