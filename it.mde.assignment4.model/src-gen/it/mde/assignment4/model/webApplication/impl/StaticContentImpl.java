/**
 */
package it.mde.assignment4.model.webApplication.impl;

import it.mde.assignment4.model.webApplication.ContentType;
import it.mde.assignment4.model.webApplication.StaticContent;
import it.mde.assignment4.model.webApplication.WebApplicationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.mde.assignment4.model.webApplication.impl.StaticContentImpl#getContentStyle <em>Content Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticContentImpl extends NamedElementImpl implements StaticContent {
	/**
	 * The default value of the '{@link #getContentStyle() <em>Content Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentStyle()
	 * @generated
	 * @ordered
	 */
	protected static final ContentType CONTENT_STYLE_EDEFAULT = ContentType.PARAGRAPH;

	/**
	 * The cached value of the '{@link #getContentStyle() <em>Content Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentStyle()
	 * @generated
	 * @ordered
	 */
	protected ContentType contentStyle = CONTENT_STYLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebApplicationPackage.Literals.STATIC_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType getContentStyle() {
		return contentStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentStyle(ContentType newContentStyle) {
		ContentType oldContentStyle = contentStyle;
		contentStyle = newContentStyle == null ? CONTENT_STYLE_EDEFAULT : newContentStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationPackage.STATIC_CONTENT__CONTENT_STYLE,
					oldContentStyle, contentStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WebApplicationPackage.STATIC_CONTENT__CONTENT_STYLE:
			return getContentStyle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WebApplicationPackage.STATIC_CONTENT__CONTENT_STYLE:
			setContentStyle((ContentType) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case WebApplicationPackage.STATIC_CONTENT__CONTENT_STYLE:
			setContentStyle(CONTENT_STYLE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WebApplicationPackage.STATIC_CONTENT__CONTENT_STYLE:
			return contentStyle != CONTENT_STYLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (contentStyle: ");
		result.append(contentStyle);
		result.append(')');
		return result.toString();
	}

} //StaticContentImpl
