package br.com.erudio;

import br.com.erudio.exceptions.UnsupporteMathOperationException;

public class Operacoes {

  public static Double sum(String numberOne, String numberTwo) throws Exception {
    if (!TratamentoNumerico.isNumeric(numberOne) || !TratamentoNumerico.isNumeric(numberTwo)) {
      throw new UnsupporteMathOperationException("Please set a numeric value!");
    }

    return TratamentoNumerico.convertToDouble(numberOne) + TratamentoNumerico.convertToDouble(numberTwo);
  }

  public static Double sub(String numberOne, String numberTwo) throws Exception{
    if (!TratamentoNumerico.isNumeric(numberOne) || !TratamentoNumerico.isNumeric(numberTwo)) {
      throw new UnsupporteMathOperationException("Please set a numeric value!");
    }

    return TratamentoNumerico.convertToDouble(numberOne) - TratamentoNumerico.convertToDouble(numberTwo);
  }

  public static Double mul(String numberOne, String numberTwo) throws Exception {
    if (!TratamentoNumerico.isNumeric(numberOne) || !TratamentoNumerico.isNumeric(numberTwo)) {
      throw new UnsupporteMathOperationException("Please set a numeric value!");
    }
    return TratamentoNumerico.convertToDouble(numberOne) * TratamentoNumerico.convertToDouble(numberTwo);
  }

  public static Double div(String numberOne, String numberTwo) throws Exception {
    if (!TratamentoNumerico.isNumeric(numberOne) || !TratamentoNumerico.isNumeric(numberTwo)) {
      throw new UnsupporteMathOperationException("Please set a numeric value!");
    }
    if (TratamentoNumerico.convertToDouble(numberTwo) == 0) {
      throw new UnsupporteMathOperationException("Division by zero is not allowed!");
    }
    return TratamentoNumerico.convertToDouble(numberOne) / TratamentoNumerico.convertToDouble(numberTwo);
  }

  public static Double med(String numberOne, String numberTwo) throws Exception {
    if (!TratamentoNumerico.isNumeric(numberOne) || !TratamentoNumerico.isNumeric(numberTwo)) {
      throw new UnsupporteMathOperationException("Please set a numeric value!");
    }
    return (TratamentoNumerico.convertToDouble(numberOne) + TratamentoNumerico.convertToDouble(numberTwo)) / 2;
  }

  public static Double sqrt(String number) throws Exception {
    if (!TratamentoNumerico.isNumeric(number)) {
      throw new UnsupporteMathOperationException("Please set a numeric value!");
    }
    return Math.sqrt(TratamentoNumerico.convertToDouble(number));
  }
}
