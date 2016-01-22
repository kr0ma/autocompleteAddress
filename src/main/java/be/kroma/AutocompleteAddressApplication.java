package be.kroma;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.soap.client.SoapFaultClientException;

@SpringBootApplication
public class AutocompleteAddressApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AutocompleteAddressApplication.class, args);
	}

	@Autowired
	AddressResultsClient client;

	@Bean
	public Jaxb2Marshaller marshaller() {
		// een marshaller zet XML om naar Java objecten en omgekeerd
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("be.kroma.soapmessages");
		return marshaller;
	}

	@Bean
	public AddressResultsClient countryClient(Jaxb2Marshaller marshaller) {
		AddressResultsClient client = new AddressResultsClient();
		client.setDefaultUri("http://api.pro6pp.nl/v1/soap");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

	@Override
	public void run(String... arg0) throws Exception {
		try (Scanner scanner = new Scanner(System.in)) {

			String invoer = "";
			do {
				System.out.println("Geef een stad");
				invoer = scanner.nextLine();
				client.getAddresses(invoer).getResult().stream()
						.forEach(adres -> System.out.println(adres.getCity() + " " + adres.getProvince()));
			} while (!invoer.equals("stop"));
		} catch (SoapFaultClientException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getLocalizedMessage());
			System.out.println(ex.getFaultCode());
		}
	}
}
