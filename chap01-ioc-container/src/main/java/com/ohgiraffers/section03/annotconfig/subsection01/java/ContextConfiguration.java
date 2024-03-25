package com.ohgiraffers.section03.annotconfig.subsection01.java;

import org.springframework.context.annotation.ComponentScan;

/* ComponentScan?
*  base package로 설정된 하위 경로에 특정 어노테이션을 가지고 있는 클래스를 bean으로 등록하는 기능이다.
*  base package를 설정하지 않으면 기본적으로 설정파일과 동일한 패키지에 있는 bean만 탐색한다.
*  @Component 어노테이션이 작성 된 클래스를 인식하여 bean으로 등록한다.
* */
@ComponentScan(basePackages = "com.ohgiraffers")
public class ContextConfiguration {
}
