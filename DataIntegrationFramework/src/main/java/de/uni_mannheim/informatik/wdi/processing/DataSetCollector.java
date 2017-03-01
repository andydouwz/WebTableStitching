/** 
 *
 * Copyright (C) 2015 Data and Web Science Group, University of Mannheim, Germany (code@dwslab.de)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 		http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package de.uni_mannheim.informatik.wdi.processing;

import de.uni_mannheim.informatik.wdi.model.DataSet;
import de.uni_mannheim.informatik.wdi.model.Matchable;

/**
 * @author Oliver Lehmberg (oli@dwslab.de)
 *
 */
public class DataSetCollector<RecordType extends Matchable, SchemaElementType> implements DatasetIterator<RecordType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DataSet<RecordType, SchemaElementType> result;
	
	/**
	 * @return the result
	 */
	public DataSet<RecordType, SchemaElementType> getResult() {
		return result;
	}
	
	/**
	 * @param result the result to set
	 */
	public void setResult(DataSet<RecordType, SchemaElementType> result) {
		this.result = result;
	}
	
	@Override
	public void initialise() {
	}

	@Override
	public void next(RecordType record) {
		result.add(record);
	}

	@Override
	public void finalise() {
	}

}