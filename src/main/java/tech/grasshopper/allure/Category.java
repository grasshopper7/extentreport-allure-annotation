package tech.grasshopper.allure;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static tech.grasshopper.allure.LabelAnnotationNames.CATEGORY_LABEL_NAME;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import io.qameta.allure.LabelAnnotation;

@Documented
@Retention(RUNTIME)
@Target({ TYPE, METHOD })
@Repeatable(Categories.class)
@LabelAnnotation(name = CATEGORY_LABEL_NAME)
public @interface Category {

	String value();

}
