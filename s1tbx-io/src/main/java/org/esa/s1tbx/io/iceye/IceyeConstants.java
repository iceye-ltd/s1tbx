package org.esa.s1tbx.io.iceye;

import java.text.DateFormat;

import org.esa.snap.core.datamodel.ProductData.UTC;

class IceyeConstants {
    static final String ACQUISITION_MODE = "ACQUISITION_MODE";
    static final String COMPLEX = "COMPLEX";
    static final String DETECTED = "DETECTED";
    static final String GDALMETADATA = "<GDALMetadata";
    static final String geo_ref_system_default = "WGS84";
    static final String ground = "ground";
    static final String ICEYE_FILE_PREFIX = "ICEYE";
    static final String left = "left";
    static final String METADATA_JSON = "METADATA_JSON";
    static final String PRODUCT_NAME = "PRODUCT_NAME";
    static final String PRODUCT_TYPE = "PRODUCT_TYPE";
    static final String ProductMetadata = "productMetadata";
    static final String spot = "spot";
    static final String spotlight = "spotlight";
    static final String strip = "strip";
    static final String stripmap = "stripmap";
    static final String time = "time";
    static final String coeffs = "coeffs";
    static final String qlk_png = "qlk.png";
    static final String thm_png = "thm.png";
    static final String Quicklook = "Quicklook";
    static final String Thumbnail = "Thumbnail";

    static final DateFormat standardDateFormat = UTC.createDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    static final int ABS_CALIBRATION_FLAG_DEFAULT_VALUE = 0;
    static final int ANT_ELEV_CORR_FLAG_DEFAULT_VALUE = 1;
    static final int BISTATIC_CORRECTION_APPLIED_DEFAULT = 1;
    static final int COREGISTERED_STACK_DEFAULT_VALUE = 0;
    static final int INC_ANGLE_COMP_FLAG_DEFAULT_VALUE = 0;
    static final int RANGE_SPREAD_COMP_FLAG_DEFAULT_VALUE = 1;
    static final int REPLICA_POWER_CORR_FLAG_DEFAULT_VALUE = 0;

    static final int TIFFTagImageWidth = 256;
    static final int TIFFTagImageLength = 257;
    static final int TIFFTagModelTransformation = 34264;
    static final int TIFFTagGDAL_METADATA = 42112;

    static final int AMPLITUDE_BAND_INDEX = 0;
    static final int PHASE_BAND_INDEX = 1;
    static final int I_BAND_VIRTUAL_INDEX = 2;
    static final int Q_BAND_VIRTUAL_INDEX = 3;
    static final int QUICKLOOK_INDEX = 4;

    static final String amplitude_band_prefix = "Amplitude_";
    static final String phase_band_prefix = "Phase_";
    static final String i_band_prefix = "i_";
    static final String q_band_prefix = "q_";

    static final String SEP = ",";
    
    static final String data                        = "data" ;

    static final String calibration_factor          = data          + SEP + "calibration_factor";
    static final String looks                       = data          + SEP + "looks";
    
    static final String azimuth_looks               = looks         + SEP + "az" + SEP + "count" ;
    static final String range_looks                 = looks         + SEP + "rg" + SEP + "count";
    
    static final String processing                  = data          + SEP + "processing";
    
    static final String azimuth_bandwidth           = processing    + SEP + "bandwidth"+ SEP + "az";
    static final String ProcessngSystemIdentifier   = processing    + SEP + "version";
    static final String PROC_TIME                   = processing    + SEP + "end";
    static final String first_line_time             = processing    + SEP + "zero_doppler_start_utc";
    static final String last_line_time              = processing    + SEP + "zero_doppler_end_utc";
    static final String pulse_repetition_frequency  = processing    + SEP + "prf";

    static final String sample                      = data          + SEP + "sample";
    static final String sample_size                 = sample        + SEP + "size";
    static final String num_samples_per_line        = sample_size   + SEP + "rg";
    static final String num_output_lines            = sample_size   + SEP + "az";
    static final String sample_sp                   = sample        + SEP + "spacing";
    static final String azimuth_spacing             = sample_sp     + SEP + "az";
    static final String range_spacing               = sample_sp     + SEP + "rg";

    static final String scene                       = data          + SEP + "scene";
    static final String avg_scene_height            = scene         + SEP + "average_scene_height";
    static final String inc_angle                   = scene         + SEP + "incidence_angle";
    static final String inc_angle_coeffs            = inc_angle     + SEP + "coefficients";
    static final String incidence_far               = inc_angle     + SEP + "far";
    static final String incidence_near              = inc_angle     + SEP + "near";
    static final String projection                  = scene         + SEP + "projection";
    static final String grsr                        = projection    + SEP + "grsr";
    static final String grsr_coefficients           = grsr          + SEP + "coefficients";
    static final String zero_doppler_time_utc       = grsr          + SEP + "zero_doppler_time_utc";
    static final String projection_plane            = projection    + SEP + "plane" ;
    static final String slant_range_to_first_pixel  = scene         + SEP + "slant_range_to_first_pixel";

    static final String product_type                = data          + SEP + "type";
    static final String product_name                = data          + SEP + "file";
    
    static final String collection                  = "collection";
    
    static final String antenna_pointing            = collection    + SEP + "look_side";
    static final String acquisition_mode            = collection    + SEP + "mode";
    static final String acquisition_start_utc       = collection    + SEP + "start";
    static final String acquisition_end_utc         = collection    + SEP + "end";
    static final String data_take_id                = collection    + SEP + "id";
    static final String orbit                       = collection    + SEP + "orbit";
    static final String orbit_states                = orbit         + SEP + "states";
    static final String position                    = "position" ;
    static final String velocity                    = "velocity" ;
    static final String PASS                        = orbit         + SEP + "direction";
    static final String platform                    = collection    + SEP + "platform";
    static final String polarization                = collection    + SEP + "polarization";
    static final String radar_frequency             = collection    + SEP + "carrier_frequency";
    static final String range_bandwidth             = collection    + SEP + "chirp_bandwidth";
    static final String range_sampling_rate         = collection    + SEP + "range_sampling_rate";
    static final String dop_param                   = collection    + SEP + "doppler_parameters";
    static final String centroid_estimates          = dop_param     + SEP + "centroid_estimates";
    static final String doppler_rate_coffs          = dop_param     + SEP + "rate_coeffs";
}
