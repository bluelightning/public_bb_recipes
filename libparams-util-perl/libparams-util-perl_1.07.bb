DESCRIPTION = "Params::Util - Simple, compact and correct param-checking functions"
SECTION = "libs"
LICENSE = "GPL-2.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b41a38c91c3e99543225495ccf83895d"

RDEPENDS_${PN} += "	perl-module-exporter \
			perl-module-overload \
             		perl-module-scalar-util \
			perl-module-strict \
			perl-module-vars"
PR = "r5"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AD/ADAMK/Params-Util-${PV}.tar.gz"

S = "${WORKDIR}/Params-Util-${PV}"

inherit cpan

BBCLASSEXTEND="native"

SRC_URI[md5sum] = "02db120c0eef87aae1830cc62bdec37b"
SRC_URI[sha256sum] = "30f1ec3f2cf9ff66ae96f973333f23c5f558915bb6266881eac7423f52d7c76c"


