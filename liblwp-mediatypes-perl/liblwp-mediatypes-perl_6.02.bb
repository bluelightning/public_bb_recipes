SUMMARY = "LWP::MediaTypes - guess media type for a file or a URL"
AUTHOR = "Gisle Aas <gisle@activestate.com>"
HOMEPAGE = "https://metacpan.org/module/LWP::MediaTypes"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=077ad44cb9de6debcc32007d9b5a0d0f"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/LWP-MediaTypes-6.02.tar.gz"
SRC_URI[md5sum] = "8c5f25fb64b974d22aff424476ba13c9"
SRC_URI[sha256sum] = "18790b0cc5f0a51468495c3847b16738f785a2d460403595001e0b932e5db676"

S = "${WORKDIR}/LWP-MediaTypes-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
