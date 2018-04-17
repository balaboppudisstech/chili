package info.chili.security;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * used to mark field to be not written as jackson processing for logging etc.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface SensitiveData {

}
