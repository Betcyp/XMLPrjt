package com.first;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.constants.XMLConstants;


public class CreateXML {
	
	public static void objToXml() {
		
		try {
			Document npci = new Document();
			
			npci.addMndAuthRequest(new MndtAuthRequest(new GroupHeader(XMLConstants.NPCI_REF_MSG_ID,XMLConstants.CREDT_TM,new ReqInitPty
					(new Info(XMLConstants.INFO_ID,XMLConstants.INFO_CATCODE,XMLConstants.INFO_UTILCODE,XMLConstants.INFO_CATDESC,XMLConstants.INFO_NAME,XMLConstants.INFO_SPN_BNK_NM)), null),
					new Mndt(XMLConstants.MNDT_REQ_ID,XMLConstants.MNDT_TYPE,XMLConstants.SCHM_NM,XMLConstants.MNDT_ID,
					new Ocrncs(XMLConstants.OCRNCS_SEQ_TP,XMLConstants.OCRNCS_FRQCY,XMLConstants.OCRNCS_FRST_COLLTN_DT,XMLConstants.OCRNCS_FNL_COLLTN_DT),XMLConstants.COLLTN_AMT,XMLConstants.MAX_AMT,
					new DebitTransactions(XMLConstants.DBTR_NAME,XMLConstants.DBTR_ACC_NO,XMLConstants.DBTR_ACCT_TYPE,XMLConstants.DBTR_CONS_REF_NO,XMLConstants.DBTR_PHONE,XMLConstants.DBTR_MOBILE,XMLConstants.DBTR_EMAIL),
					new CreditAccountDetails(XMLConstants.CRACCD1_NM,XMLConstants.CRACCD1_ACC_NO,XMLConstants.CRACCD1_MMB_ID))));
			
			npci.addSignature(new Signature(new SignedInfo("VBN","BNH",new ReferenceURI(new Transforms("http://www.w3.org//xmldsig #enveloped-signature"),"abc",XMLConstants.DIGEST_VALUE)),XMLConstants.SIGNATURE_VALUE,new KeyInfo(new X509Data(XMLConstants.X509_SUBJECT_NAME,XMLConstants.X509_CERTIFICATE))));
			
			
			JAXBContext jaxbContext = JAXBContext.newInstance(Document.class);
			
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			//marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, " http:npci.org/onmags/schema");
			
			File file = new File("C:/Users/betcy.pbabu/eclipse-workspace/XMLProject/src/test/resources/NACH.xml");
			marshaller.marshal(npci, file);
			System.out.println("successfully created");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}


