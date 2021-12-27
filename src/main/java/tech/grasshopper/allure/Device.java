package tech.grasshopper.allure;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static tech.grasshopper.allure.LabelAnnotationNames.DEVICE_LABEL_NAME;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import io.qameta.allure.LabelAnnotation;

@Documented
@Retention(RUNTIME)
@Target({ TYPE, METHOD })
@Repeatable(Devices.class)
@LabelAnnotation(name = DEVICE_LABEL_NAME)
public @interface Device {

	String value();

}
