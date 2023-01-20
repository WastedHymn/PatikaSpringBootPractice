package com.kadiryuksel.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class BeanDto {
    private Long id;
    private String beanName;
    private String beanData;

    public void initialBeanMethod(){
        log.info("initialBeanMethod: BeanDto");
        System.out.println("Before bean starts to work...");
    }

    public void destroyBeanMethod(){
        log.info("destroyBeanMethod: BeanDto");
        System.err.println("After bean finishes to work...");
    }
}
