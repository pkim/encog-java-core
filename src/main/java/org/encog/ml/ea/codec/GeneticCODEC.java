/*
 * Encog(tm) Core v3.2 - Java Version
 * http://www.heatonresearch.com/encog/
 * https://github.com/encog/encog-java-core
 
 * Copyright 2008-2013 Heaton Research, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *   
 * For more information on Heaton Research copyrights, licenses 
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package org.encog.ml.ea.codec;

import org.encog.ml.MLMethod;
import org.encog.ml.ea.genome.Genome;

/**
 * A CODEC defines how to transfer between a genome and phenome. Every CODEC
 * should support genome to phenome. However, not every code can transform a
 * phenome into a genome.
 */
public interface GeneticCODEC {

	/**
	 * Decode the specified genome into a phenome. A phenome is an actual
	 * instance of a genome that you can query.
	 * 
	 * @param genome
	 *            The genome to decode.
	 * @return The phenome.
	 */
	MLMethod decode(Genome genome);

	/**
	 * Attempt to build a genome from a phenome. Note: not all CODEC's support
	 * this. If it is unsupported, an exception will be thrown.
	 * 
	 * @param phenotype
	 *            The phenotype.
	 * @return The genome.
	 */
	Genome encode(MLMethod phenotype);
}
