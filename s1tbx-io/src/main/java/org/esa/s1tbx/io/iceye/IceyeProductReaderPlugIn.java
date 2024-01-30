package org.esa.s1tbx.io.iceye;

import java.io.File;
import java.nio.file.Path;
import java.util.Locale;

import org.esa.s1tbx.commons.io.S1TBXFileFilter;
import org.esa.s1tbx.commons.io.S1TBXProductReaderPlugIn;
import org.esa.snap.core.dataio.DecodeQualification;
import org.esa.snap.core.dataio.ProductReader;
import org.esa.snap.core.util.io.SnapFileFilter;
import org.esa.snap.engine_utilities.gpf.ReaderUtils;

public class IceyeProductReaderPlugIn implements S1TBXProductReaderPlugIn {

    private final String PLUGIN_DESCRIPTION = "UNDER CONSTRUCTION -- Iceye Products";
    private final String[] FORMAT_NAMES = { "Iceye" };
    private final String[] FILE_PREFIXES = { "ICEYE" };
    private final String[] FILE_EXTS = { ".tif", ".h5", ".xml", ".json" };
    private final String[] METADATA_EXTS = { ".xml", ".json" };
    private final Class<?>[] VALID_INPUT_TYPES = new Class[] { Path.class, File.class, String.class };

    @Override
    public Class<?>[] getInputTypes() {
        return VALID_INPUT_TYPES;
    }

    public DecodeQualification getDecodeQualification(Object input) {
        final Path path = ReaderUtils.getPathFromInput(input);

        if (path == null || path.getFileName() == null) {
            return DecodeQualification.UNABLE;
        }

        final String filename = path.getFileName().toString().toUpperCase();

        if (filename.startsWith(IceyeConstants.ICEYE_FILE_PREFIX)) {
            for (String ext : FILE_EXTS) {
                if (filename.endsWith(ext.toUpperCase())) {
                    return DecodeQualification.INTENDED;
                }
            }
        }

        return DecodeQualification.UNABLE;
    }

    public ProductReader createReaderInstance() {
        // return new IceyeProductReader(this);
        return new IceyeProductReader(this);
    }

    public String[] getProductMetadataFilePrefixes() {
        return FILE_PREFIXES;
    }

    public String[] getDefaultFileExtensions() {
        return FILE_EXTS;
    }

    public String[] getProductMetadataFileExtensions() {
        return METADATA_EXTS;
    }

    public String[] getFormatNames() {
        return FORMAT_NAMES;
    }

    public String getDescription(Locale locale) {
        return PLUGIN_DESCRIPTION;
    }

    @Override
    public SnapFileFilter getProductFileFilter() {
        return new S1TBXFileFilter(this);
    }
}
