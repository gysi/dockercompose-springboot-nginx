/**
 * Sets a POJO's Scope with the @Scope Annotation.
 *
 * Default Bean Scopes in Spring
 *
 * singleton - Creates a single bean instance per Spring IoC container
 * prototype - Creates a new bean instance each time when requested
 * request - Creates a single bean instance per HTTP request; valid only in the context of a web
 * application
 * session - Creates a single bean instance per HTTP session; valid only in the context of a web
 * application
 * globalSession - Creates a single bean instance
 *
 * In this example singleton (default) and prototype scopes are used.
 *
 * How to run this Chapter?
 * Just run the init method within your public static void main method:
 * Main_ch_2_5.init();
 */
package de.gregord.springboot.test.spring_5_recipes.ch_2_5;
