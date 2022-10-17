package services;

import java.security.InvalidParameterException;

public interface InterestService {

	double getInterestRate();
	
	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}

// A Interface não pode armazenar estado. Entçao eu não posso colocar valor aqui.

/*Herança múltipla: O compilador reclama se houver mais de um método com a mesma
 * assinatura, obrigando a sobrescreve-lo*/
 