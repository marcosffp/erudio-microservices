package br.com.erudio;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		return Operacoes.sum(numberOne, numberTwo);
	}

	@RequestMapping(value = "/sub/{numberOne}/{" + "numberTwo}", method = RequestMethod.GET)
	public Double sub(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		return Operacoes.sub(numberOne, numberTwo);
	}

	@RequestMapping(value = "/mul/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mul(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		return Operacoes.mul(numberOne, numberTwo);
	}

	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double div(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		return Operacoes.div(numberOne, numberTwo);
	}

	@RequestMapping(value = "/med/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double med(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		return Operacoes.med(numberOne, numberTwo);
	}

	@RequestMapping(value = "/sqrt/{number}", method = RequestMethod.GET)
	public Double sqrt(@PathVariable(value = "number") String number) throws Exception {

		return Operacoes.sqrt(number);
	}

}
