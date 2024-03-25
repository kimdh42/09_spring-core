package com.ohgiraffers.section01.autowired.subsection01.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService bookService = context.getBean("bookServiceField", BookService.class);

        /* 전체 도서 목록 조회 후 출력 확인 */
        bookService.selectAllBooks().forEach(System.out::println);

        /* 도서 번호로 도서 조회 후 출력 확인 */
        System.out.println(bookService.searchBookBySequence(1));
        System.out.println(bookService.searchBookBySequence(2));
    }
}
