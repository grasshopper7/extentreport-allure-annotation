package tech.grasshopper.allure;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static tech.grasshopper.allure.LabelAnnotationNames.AUTHOR_LABEL_NAME;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import io.qameta.allure.LabelAnnotation;

@Documented
@Retention(RUNTIME)
@Target({ TYPE, METHOD })
@Repeatable(Authors.class)
@LabelAnnotation(name = AUTHOR_LABEL_NAME)
public @interface Author {

	String value();

}
