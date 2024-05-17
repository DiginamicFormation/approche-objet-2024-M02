package annotations;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Annotation à placer sur un attribut et qui fournit des indications sur la
 * manière de l'afficher dans un toString()
 * 
 * @author RichardBONNAMY
 *
 */
@Retention(RUNTIME)
@Target(ElementType.FIELD)
public @interface ToString {

	/**
	 * Indique si oui ou non l'attribut doit être mis en MAJ Attention ne s'applique
	 * qu'aux attributs de type String
	 * 
	 * @return boolean
	 */
	boolean uppercase() default false;

	/**
	 * Indique la chaine de caractères à placer après la valeur de l'attribut
	 * 
	 * @return {@link String}
	 */
	String separateur() default "";
}