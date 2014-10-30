/**
 * Copyright (c) 2014 Puppet Labs, Inc. and other contributors, as listed below.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Puppet Labs
 *
 */
package com.puppetlabs.geppetto.module.dsl.validation;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.puppetlabs.geppetto.pp.dsl.validation.ValidationPreference;

public class ModuleValidationAdvisorBean implements IModuleValidationAdvisor, Serializable {
	private static final long serialVersionUID = 1L;

	private final ValidationPreference circularDependency;

	private final ValidationPreference dependencyVersionMismatch;

	private final ValidationPreference deprecatedKey;

	private final ValidationPreference missingForgeRequiredFields;

	private final ValidationPreference moduleNameNotStrict;

	private final ValidationPreference moduleRedefinition;

	private final ValidationPreference modulefileExists;

	private final ValidationPreference modulefileExistsAndIsUsed;

	private final ValidationPreference unexpectedSubmodule;

	private final ValidationPreference unrecognizedKey;

	private final ValidationPreference unresolvedReference;

	private final ValidationPreference whitespaceInTag;

	@JsonCreator
	public ModuleValidationAdvisorBean(
			// @fmtOff
			@JsonProperty("circular_dependency") ValidationPreference circularDependency,
			@JsonProperty("dependency_version_mismatch") ValidationPreference dependencyVersionMismatch,
			@JsonProperty("deprecated_key") ValidationPreference deprecatedKey,
			@JsonProperty("missing_forge_required_fields") ValidationPreference missingForgeRequiredFields,
			@JsonProperty("module_name_not_strict") ValidationPreference moduleNameNotStrict,
			@JsonProperty("module_redefinition") ValidationPreference moduleRedefinition,
			@JsonProperty("modulefile_exists") ValidationPreference modulefileExists,
			@JsonProperty("modulefile_exists_and_is_used") ValidationPreference modulefileExistsAndIsUsed,
			@JsonProperty("unexpected_submodule") ValidationPreference unexpectedSubmodule,
			@JsonProperty("unrecognized_key") ValidationPreference unrecognizedKey,
			@JsonProperty("unresolved_reference") ValidationPreference unresolvedReference,
			@JsonProperty("whitespace_in_tag") ValidationPreference whitespaceInTag) {
		// @fmtOn
		this.circularDependency = circularDependency;
		this.dependencyVersionMismatch = dependencyVersionMismatch;
		this.deprecatedKey = deprecatedKey;
		this.missingForgeRequiredFields = missingForgeRequiredFields;
		this.moduleNameNotStrict = moduleNameNotStrict;
		this.moduleRedefinition = moduleRedefinition;
		this.modulefileExists = modulefileExists;
		this.modulefileExistsAndIsUsed = modulefileExistsAndIsUsed;
		this.unexpectedSubmodule = unexpectedSubmodule;
		this.unrecognizedKey = unrecognizedKey;
		this.unresolvedReference = unresolvedReference;
		this.whitespaceInTag = whitespaceInTag;
	}

	/**
	 * @return the circularDependency
	 */
	@Override
	public ValidationPreference getCircularDependency() {
		return circularDependency;
	}

	/**
	 * @return the dependencyVersionMismatch
	 */
	@Override
	public ValidationPreference getDependencyVersionMismatch() {
		return dependencyVersionMismatch;
	}

	/**
	 * @return the deprecatedKey
	 */
	@Override
	public ValidationPreference getDeprecatedKey() {
		return deprecatedKey;
	}

	/**
	 * @return the missingForgeRequiredFields
	 */
	@Override
	public ValidationPreference getMissingForgeRequiredFields() {
		return missingForgeRequiredFields;
	}

	/**
	 * @return the modulefileExists
	 */
	@Override
	public ValidationPreference getModulefileExists() {
		return modulefileExists;
	}

	/**
	 * @return the modulefileExistsAndIsUsed
	 */
	@Override
	public ValidationPreference getModulefileExistsAndIsUsed() {
		return modulefileExistsAndIsUsed;
	}

	/**
	 * @return the moduleNameNotStrict
	 */
	@Override
	public ValidationPreference getModuleNameNotStrict() {
		return moduleNameNotStrict;
	}

	/**
	 * @return the moduleRedefinition
	 */
	@Override
	public ValidationPreference getModuleRedefinition() {
		return moduleRedefinition;
	}

	/**
	 * @return the unexpectedSubmodule
	 */
	@Override
	public ValidationPreference getUnexpectedSubmodule() {
		return unexpectedSubmodule;
	}

	/**
	 * @return the unrecognizedKey
	 */
	@Override
	public ValidationPreference getUnrecognizedKey() {
		return unrecognizedKey;
	}

	/**
	 * @return the unresolvedReference
	 */
	@Override
	public ValidationPreference getUnresolvedReference() {
		return unresolvedReference;
	}

	/**
	 * @return the whitespaceInTag
	 */
	@Override
	public ValidationPreference getWhitespaceInTag() {
		return whitespaceInTag;
	}

	public IModuleValidationAdvisor merge(IModuleValidationAdvisor moduleAdvisor) {
		// @fmtOff
		return new ModuleValidationAdvisorBean(
			circularDependency == null ? moduleAdvisor.getCircularDependency() : circularDependency,
			dependencyVersionMismatch == null ? moduleAdvisor.getDependencyVersionMismatch() : dependencyVersionMismatch,
			deprecatedKey == null ? moduleAdvisor.getDeprecatedKey() : deprecatedKey,
			missingForgeRequiredFields == null ? moduleAdvisor.getMissingForgeRequiredFields() : missingForgeRequiredFields,
			moduleNameNotStrict == null ? moduleAdvisor.getModuleNameNotStrict() : moduleNameNotStrict,
			moduleRedefinition == null ? moduleAdvisor.getModuleRedefinition() : moduleRedefinition,
			modulefileExists == null ? moduleAdvisor.getModulefileExists() : modulefileExists,
			modulefileExistsAndIsUsed == null ? moduleAdvisor.getModulefileExistsAndIsUsed() : modulefileExistsAndIsUsed,
			unexpectedSubmodule == null ? moduleAdvisor.getUnexpectedSubmodule() : unexpectedSubmodule,
			unrecognizedKey == null ? moduleAdvisor.getUnrecognizedKey() : unrecognizedKey,
			unresolvedReference == null ? moduleAdvisor.getUnresolvedReference() : unresolvedReference,
			whitespaceInTag == null ? moduleAdvisor.getWhitespaceInTag() : whitespaceInTag);
		// @fmtOn
	}
}