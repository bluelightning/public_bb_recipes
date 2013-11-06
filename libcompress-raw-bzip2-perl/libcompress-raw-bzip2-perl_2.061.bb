SUMMARY = "Compress::Raw::Bzip2 - Low-Level Interface to bzip2 compression library"
AUTHOR = "Paul Marquees <pmqs@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/Compress::Raw::Bzip2"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=39878029ff521daff10061c8eeac238e"

SRC_URI = "http://cpan.metacpan.org/authors/id/P/PM/PMQS/Compress-Raw-Bzip2-2.061.tar.gz"
SRC_URI[md5sum] = "44648bb83e8ec7189afc531ba32143be"
SRC_URI[sha256sum] = "de8e39e738e05d7e7c6c855ce059dd90f4907bc5968292e3d43d0f003117c62d"

S = "${WORKDIR}/Compress-Raw-Bzip2-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
