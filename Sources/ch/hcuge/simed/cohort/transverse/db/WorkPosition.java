package ch.hcuge.simed.cohort.transverse.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkPosition extends _WorkPosition {
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(WorkPosition.class);

	@Override
	public String toString() {
		return role().name() + " / " + workLocation().name();
		
	}
	
	
}
