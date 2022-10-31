package ch.hcuge.simed.cohort.transverse.db;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.webobjects.eocontrol.EOEditingContext;

public class Center extends _Center {
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(Center.class);
	private String langue;
	@Override
	public void awakeFromInsertion(EOEditingContext editingContext) {
		super.awakeFromInsertion(editingContext);
		this.setPublicID(UUID.randomUUID().toString());
	}
	public String defaultlanguage()
	{
		if (langue == null)
		{	
			switch (publicID()) {
			case "ZAS-SSCS_HP_VS":
			case "ZAS-SSCS_HUG_GE":
			case "ZAS-SSCS_CHUV_VD":
				langue = "fr";
				break;

			default:
				langue = "ge";
				break;
			}
			
		}
		return langue;
	}
}
