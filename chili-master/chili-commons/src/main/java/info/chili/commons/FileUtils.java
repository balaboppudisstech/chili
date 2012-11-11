/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package info.chili.commons;

/**
 *
 * @author ayalamanchili
 */
public class FileUtils {

    public enum DOC_EXTENSIONS {

        PDF, DOC, DOCX, TXT, RTF
    };

    public enum IMG_EXTENSIONS {

        JPG, JPEG, GIF, PNG
    };

    public static String getFileExtension(String filename) {
        return filename.substring(filename.lastIndexOf(".") + 1, filename.length());
    }

    public static boolean isImage(String filename) {
        for (IMG_EXTENSIONS ext : IMG_EXTENSIONS.values()) {
            if (ext.name().equalsIgnoreCase(getFileExtension(filename))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDocument(String filename) {
        for (DOC_EXTENSIONS ext : DOC_EXTENSIONS.values()) {
            if (ext.name().equalsIgnoreCase(getFileExtension(filename))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPDF(String filename) {
        if (getFileExtension(filename).equalsIgnoreCase(DOC_EXTENSIONS.PDF.name())) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isWordDoc(String filename) {
        if (getFileExtension(filename).equalsIgnoreCase(DOC_EXTENSIONS.DOC.name()) || getFileExtension(filename).equalsIgnoreCase(DOC_EXTENSIONS.DOCX.name())) {
            return true;
        } else {
            return false;
        }
    }
}