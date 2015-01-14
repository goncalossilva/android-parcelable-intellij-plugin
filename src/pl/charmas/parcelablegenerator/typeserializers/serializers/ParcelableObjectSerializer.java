package pl.charmas.parcelablegenerator.typeserializers.serializers;

import com.intellij.psi.PsiField;
import pl.charmas.parcelablegenerator.typeserializers.TypeSerializer;

/**
 * Serializer for types implementing Parcelable
 *
 * @author Dallas Gutauckis [dallas@gutauckis.com]
 */
public class ParcelableObjectSerializer implements TypeSerializer {
    @Override
    public String writeValue(PsiField field, String parcel, String flags) {
        return parcel + ".writeParcelable(" + field.getName() + ", 0);";
    }

    @Override
    public String readValue(PsiField field, String parcel) {
        return field.getName() + " = " + parcel + ".readParcelable(" + field.getType().getCanonicalText() + ".class.getClassLoader());";
    }
}
