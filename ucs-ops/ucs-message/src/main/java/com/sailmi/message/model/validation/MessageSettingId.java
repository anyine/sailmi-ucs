package com.sailmi.message.model.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;


@Documented
@Constraint(validatedBy = { })
@NotNull
@Range(min = 0, max = Byte.MAX_VALUE)
@Target({ FIELD })
@Retention(RUNTIME)
@ReportAsSingleViolation
public @interface MessageSettingId {

	String message() default "{com.sailmi.message.constraints.MessageSetting.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
