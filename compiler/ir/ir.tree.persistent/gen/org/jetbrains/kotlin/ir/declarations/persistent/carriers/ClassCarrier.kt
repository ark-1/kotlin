/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir.declarations.persistent.carriers

import org.jetbrains.kotlin.descriptors.DescriptorVisibility
import org.jetbrains.kotlin.descriptors.Modality
import org.jetbrains.kotlin.ir.declarations.IrAttributeContainer
import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent
import org.jetbrains.kotlin.ir.declarations.IrTypeParameter
import org.jetbrains.kotlin.ir.declarations.IrValueParameter
import org.jetbrains.kotlin.ir.declarations.MetadataSource
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall
import org.jetbrains.kotlin.ir.types.IrType

// Auto-generated by compiler/ir/ir.tree.persistent/generator/src/org/jetbrains/kotlin/ir/persistentIrGenerator/Main.kt. DO NOT EDIT!

internal interface ClassCarrier : DeclarationCarrier{
    val thisReceiverField: IrValueParameter?
    val metadataField: MetadataSource?
    val visibilityField: DescriptorVisibility
    val modalityField: Modality
    val attributeOwnerIdField: IrAttributeContainer
    val typeParametersField: List<IrTypeParameter>
    val superTypesField: List<IrType>

    override fun clone(): ClassCarrier {
        return ClassCarrierImpl(
            lastModified,
            parentField,
            originField,
            annotationsField,
            thisReceiverField,
            metadataField,
            visibilityField,
            modalityField,
            attributeOwnerIdField,
            typeParametersField,
            superTypesField
        )
    }
}

internal class ClassCarrierImpl(
    override val lastModified: Int,
    override val parentField: IrDeclarationParent?,
    override val originField: IrDeclarationOrigin,
    override val annotationsField: List<IrConstructorCall>,
    override val thisReceiverField: IrValueParameter?,
    override val metadataField: MetadataSource?,
    override val visibilityField: DescriptorVisibility,
    override val modalityField: Modality,
    override val attributeOwnerIdField: IrAttributeContainer,
    override val typeParametersField: List<IrTypeParameter>,
    override val superTypesField: List<IrType>
) : ClassCarrier
