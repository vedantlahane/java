package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static void main(String[] args) {

        /*
         * =========================================================
         * OLD MANUAL DEPENDENCY INJECTION
         * =========================================================
         *
         * Before Spring, WE had to manually create objects.
         *
         * For example:
         *
         * PaymentService service = new UpiPayment();
         * OrderService order = new OrderService(service);
         * order.placeOrder();
         *
         * The problem is that WE are responsible for:
         *
         * 1. Creating the PaymentService object.
         * 2. Creating the OrderService object.
         * 3. Passing PaymentService into OrderService.
         *
         * Spring's IoC Container can handle these responsibilities
         * for us.
         */


        /*
         * Example of the manual approach:
         *
         * PaymentService service = new UpiPayment();
         * OrderService order = new OrderService(service);
         * order.placeOrder();
         *
         * This is Dependency Injection, but we are doing it manually.
         */


        /*
         * =========================================================
         * SPRING IOC CONTAINER
         * =========================================================
         *
         * ApplicationContext represents the Spring IoC Container.
         *
         * The IoC Container is responsible for:
         *
         * - Creating objects
         * - Managing objects
         * - Injecting dependencies
         * - Managing the lifecycle of Spring Beans
         *
         * In Spring terminology:
         *
         * Objects managed by Spring are called BEANS.
         */
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);


        /*
         * =========================================================
         * GETTING A BEAN FROM THE IOC CONTAINER
         * =========================================================
         *
         * We do NOT write:
         *
         *     new OrderService(...)
         *
         * anymore.
         *
         * Why?
         *
         * Because Spring has already created and managed
         * the OrderService Bean.
         *
         * getBean() asks the IoC Container:
         *
         * "Give me the OrderService Bean."
         *
         * OrderService.class provides the metadata/type
         * Spring needs to identify the required Bean.
         */
        OrderService order = context.getBean(OrderService.class);


        /*
         * Now we simply use the Bean.
         *
         * When placeOrder() runs:
         *
         * 1. payment.pay() is called.
         * 2. The injected PaymentService executes.
         * 3. Because UpiPayment is @Primary,
         *    UpiPayment.pay() is used.
         * 4. "Order Placed" is printed.
         */
        order.placeOrder();


        /*
         * =========================================================
         * DIRECTLY GETTING PAYMENT BEAN
         * =========================================================
         *
         * We could also ask the IoC Container directly
         * for a PaymentService Bean.
         *
         * However, because we have TWO implementations:
         *
         *     UpiPayment
         *     CardPayment
         *
         * we need to consider which implementation Spring should use.
         *
         * @Primary on UpiPayment tells Spring to prefer UpiPayment.
         *
         * Example:
         *
         * PaymentService payment = context.getBean(PaymentService.class);
         * payment.pay();
         *
         * This would use UpiPayment because it is @Primary.
         */


        /*
         * Uncomment this if you want to test the PaymentService Bean
         * directly:
         *
         * PaymentService payment = context.getBean(PaymentService.class);
         * payment.pay();
         */
    }


    /*
     * =============================================================
     * JAVA REFLECTION EXAMPLE
     * =============================================================
     *
     * This section is NOT required for the OrderService example.
     *
     * It is here because the lecture uses it to explain
     * Java Reflection and Class<T>.
     *
     * Reflection allows a program/framework to inspect
     * information about a class at runtime.
     */


    /*
     * Creating normal Student objects manually.
     *
     * "new" creates actual Student objects.
     */
    Student s1 = new Student();
    Student s2 = new Student();


    /*
     * Student.class gives us a Class<Student> object.
     *
     * IMPORTANT:
     *
     * studentClass is NOT a Student object.
     *
     * It represents metadata about the Student class.
     *
     * Through Class<Student>, Java/frameworks can inspect things
     * such as:
     *
     * - Class name
     * - Fields
     * - Constructors
     * - Methods
     * - Annotations
     * - Access modifiers
     *
     * This is important in Spring because Spring uses reflection
     * to inspect classes and their annotations.
     */
    Class<Student> studentClass = Student.class;


    /*
     * Student class metadata example:
     *
     * Class name - Student
     *
     * Fields:
     * - name
     * - age
     *
     * Constructor:
     * - Student()
     *
     * Methods:
     * - getAttendence()
     * - print()
     */
}


/*
 * ================================================================
 * STUDENT CLASS
 * ================================================================
 *
 * This class is only being used to understand Java Reflection.
 *
 * It is NOT a Spring Bean because we have NOT added @Component.
 */
class Student {

    // Fields
    private String name;
    private int age;


    /*
     * Default / no-argument constructor.
     */
    public Student() {
    }


    /*
     * Example method.
     */
    public void getAttendence() {

    }


    /*
     * Example method.
     */
    public void print() {

    }
}