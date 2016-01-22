package be.kroma;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import be.kroma.soapmessages.AutocompleteRequest;
import be.kroma.soapmessages.AutocompleteResponse;
import be.kroma.soapmessages.Results;

public class AddressResultsClient extends WebServiceGatewaySupport{

	Results getAddresses(String city){
		AutocompleteRequest request = new AutocompleteRequest();
		request.setAuthKey("2vYIop3RfnFNgZwK");
		request.setBeCity(city);
		AutocompleteResponse response = (AutocompleteResponse) this.getWebServiceTemplate().marshalSendAndReceive(this.getDefaultUri(), request,
				new SoapActionCallback("http://api.pro6pp.nl/v1/autocomplete"));
		return response.getResults();
	}
}
