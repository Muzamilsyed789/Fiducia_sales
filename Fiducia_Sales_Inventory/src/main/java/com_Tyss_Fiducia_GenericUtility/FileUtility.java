package com_Tyss_Fiducia_GenericUtility;


	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	public class FileUtility {
/**
 * this method is used to read data from property file
 * @author PERSONALPC
 * @param key
 * @return
 * @throws IOException
 */
		public String readTheDataFromPropertyFile(String key) throws IOException {
			FileInputStream fis=new FileInputStream(IPathConstant.FilePath);
			Properties poj=new Properties();
			poj.load(fis);
			String value =poj.getProperty(key);
			return value;
		}
		}

