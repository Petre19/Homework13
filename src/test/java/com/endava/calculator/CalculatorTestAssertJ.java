package com.endava.calculator;

import com.endava.calculator.basic.Basic;
import com.endava.calculator.basic.BasicOperations;
import com.mysql.cj.log.Log;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class CalculatorTestAssertJ {
    private BasicOperations basicOperations=new Basic();

    @Test
    public void shouldAdd1Operand(){
        Long result =basicOperations.add(167);
        assertThat(result).isBetween(100L,200L)
                .isGreaterThan(150L)
                .isEqualTo(168L)
                .isNotNegative()
                .isNull();
    }
}
