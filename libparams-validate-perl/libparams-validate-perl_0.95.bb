SUMMARY = "Params::Validate - Validate method/function parameters"
SECTION = "libs"
LICENSE = "GPL-2.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a89fc6431f978476bd49e3f7a26a1a1e"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Params-Validate-${PV}.tar.gz"
SRC_URI[md5sum] = "f544f12357ae4ba44044cd8cb2b83a9f"
SRC_URI[sha256sum] = "0739ccd0e7c7c0ffc0e2ad797d78e42c050e6297ab58d56f90a0e4de623f8942"

S = "${WORKDIR}/Params-Validate-${PV}"

inherit cpan_build

FILES_${PN} = "${PERLLIBDIRS}/auto/Params/Validate/* \
                ${PERLLIBDIRS}/Params \
                ${PERLLIBDIRS}/Attribute"

RDEPENDS_${PN} += "perl-module-strict \
                   perl-module-vars \
                   perl-module-warnings \
                   perl-module-attributes \
                   perl-module-attribute-handlers \
                   perl-module-carp \
                   perl-module-scalar-util \
                   perl-module-exporter \
                   libxsloader-perl \
                   libmodule-implementation-perl \
                   "

RPROVIDES_${PN} += "libparams-validate-constants-perl \
                    libparams-validate-pp-perl \
                    libparam-validate-xs-perl \
                    "

BBCLASSEXTEND = "native"