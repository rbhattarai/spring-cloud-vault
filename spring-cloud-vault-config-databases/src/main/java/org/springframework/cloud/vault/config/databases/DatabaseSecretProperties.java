/*
 * Copyright 2016-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.vault.config.databases;

import org.springframework.cloud.vault.config.VaultSecretBackendDescriptor;

/**
 * Configuration properties interface for database secrets.
 *
 * @author Mark Paluch
 * @author Sebastien Nahelou
 */
public interface DatabaseSecretProperties extends VaultSecretBackendDescriptor {

	/**
	 * Role name.
	 * @return the role name
	 */
	String getRole();

	/**
	 * Whether the configuration uses static roles.
	 * @return {@literal true} if the configuration uses static roles.
	 * @since 2.2
	 */
	boolean isStaticRole();

	/**
	 * Backend path.
	 * @return the backend path.
	 */
	String getBackend();

	/**
	 * @return name of the target property for the obtained username.
	 */
	String getUsernameProperty();

	/**
	 * @return name of the target property for the obtained password.
	 */
	String getPasswordProperty();

}
